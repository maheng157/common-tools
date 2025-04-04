package io.github.opensabe.common.location.service;

import software.amazon.awssdk.services.geoplaces.model.ReverseGeocodeResponse;

import java.util.List;

/**
 * @author changhongwei
 * @date 2024/11/26 17:56
 * @description: 根据地址获取地理坐标
 */
public interface GeocodeService {

    /**
     * 根据地址获取地理坐标
     * @param address 地址
     * @return 经纬度列表 (longitude, latitude)
     */
    List<Double> getCoordinates(String address);


    /**
     * 根据坐标获取地理位置
     * @param position
     * @return
     */
    ReverseGeocodeResponse reverseGeocode(List<Double> position);

}
