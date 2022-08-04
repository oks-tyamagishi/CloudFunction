package com.example.repository;

import com.example.entity.TShippingPackage;
import com.example.entity.TShippingPackageExample;
import com.example.entity.TShippingPackageKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface TShippingPackageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    long countByExample(TShippingPackageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int deleteByExample(TShippingPackageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(TShippingPackageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int insert(TShippingPackage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int insertSelective(TShippingPackage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    List<TShippingPackage> selectByExampleWithRowbounds(TShippingPackageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    List<TShippingPackage> selectByExample(TShippingPackageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    TShippingPackage selectByPrimaryKey(TShippingPackageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TShippingPackage record, @Param("example") TShippingPackageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TShippingPackage record, @Param("example") TShippingPackageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TShippingPackage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table njt_005.t_shipping_package
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TShippingPackage record);
}