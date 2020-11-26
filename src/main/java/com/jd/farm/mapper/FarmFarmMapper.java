package com.jd.farm.mapper;

import com.jd.farm.domain.FarmFarm;

public interface FarmFarmMapper {
    //  获取农场信息
    public FarmFarm findById(Long id);
}
