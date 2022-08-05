## ローカル環境で実行

### 環境構築

以下をインストール

- Java Developer Kit、バージョン 11
- Apache Maven、バージョン 3.0 以降
- Azure CLI
- Azure Functions Core Tools バージョン 3.0.13901.0 以降

### 実行手順

- 環境変数 `JAVA_HOME` にてインストールしたJDKへのパスを設定する
- 「az login」コマンドを実行し、Azureにログインする
- 「local.setting.json」にて、「AzureWebJobsStorage」の値を設定する（設定については、参考リンクを参照）
- 「mvn clean」コマンドを実行し、ビルド先ディレクトリ内をクリーンする  
- 「mvn package」コマンドを実行し、デプロイ用Jarファイルを作成する
- 「mvn azure-functions:run」コマンドを実行し、Azure Functionsを実行する

## Azureデプロイ手順
前提条件：デプロイ用Jarファイルが作成済みであること、Azureにログイン済みであること
- 「mvn azure-functions:deploy」コマンドを実行し、jarファイルをAzure Functionsにデプロイする
- Azureホーム ＞ Azure Functions概要 > 関数　をクリック
- デプロイ対象名のリンクが表示されているのを確認

### デプロイ時のログチェック
- Azureホーム ＞ Azure Functions概要 > 関数 > 当該関数アプリのリンクをクリック 
- 「モニター」メニューをクリック
- ログ一覧から最新のログをクリック

### Logbackのログ確認
[Application Insightsサービスの利用を有効にする](https://www.purin-it.com/azure-functions-logback)

### エラー対処

- JDKが発見できなかったエラーの場合
　Function Core Toolにて呼び出しているJAVA_HOMEのパスを絶対パスに変更する
  - 次のファイルを開く: c:\Program Files\microsoft\Azure Functions Core Tools\workers\java\worker.config.json
  - defaultExecutablePathのプロパティに、java.exeまでの絶対パスを設定する。例：C:\Program Files\Zulu\zulu-11\bin\java  

### 参考リンク
[「AzureWebJobsStorage」の設定に必要なBlobストレージの作成 ](https://www.purin-it.com/azure-blob-storage)  
[Blobストレージをローカルでエミュレート](https://zenn.dev/k_maru/articles/using_azurite_to_develop_azure_functions_on_local)  
[「AzureWebJobsStorage」の設定値の取得（local.settings.jsonの設定内容を参照）](https://www.purin-it.com/azure-functions-timer-trigger-java)  



