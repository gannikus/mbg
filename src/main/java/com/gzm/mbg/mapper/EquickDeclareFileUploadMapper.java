package com.gzm.mbg.mapper;

import com.gzm.mbg.model.EquickDeclareFileUpload;
import java.util.List;

public interface EquickDeclareFileUploadMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquickDeclareFileUpload record);

    EquickDeclareFileUpload selectByPrimaryKey(Integer id);

    List<EquickDeclareFileUpload> selectAll();

    int updateByPrimaryKey(EquickDeclareFileUpload record);
}