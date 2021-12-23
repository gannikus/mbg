package com.gzm.mbg.mapper;

import com.gzm.mbg.model.EquickDeclareFileUploadDetail;
import java.util.List;

public interface EquickDeclareFileUploadDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquickDeclareFileUploadDetail record);

    EquickDeclareFileUploadDetail selectByPrimaryKey(Integer id);

    List<EquickDeclareFileUploadDetail> selectAll();

    int updateByPrimaryKey(EquickDeclareFileUploadDetail record);
}