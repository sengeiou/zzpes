package com.charlie.ctmpas.mapper;

import com.charlie.ctmpas.entity.PatientInfo;
import com.charlie.ctmpas.entity.PatientInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientInfoMapper {
    long countByExample(PatientInfoExample example);

    int deleteByExample(PatientInfoExample example);

    int deleteByPrimaryKey(Long patientSeq);

    int insert(PatientInfo record);

    int insertSelective(PatientInfo record);

    List<PatientInfo> selectByExample(PatientInfoExample example);

    PatientInfo selectByPrimaryKey(Long patientSeq);

    int updateByExampleSelective(@Param("record") PatientInfo record, @Param("example") PatientInfoExample example);

    int updateByExample(@Param("record") PatientInfo record, @Param("example") PatientInfoExample example);

    int updateByPrimaryKeySelective(PatientInfo record);

    int updateByPrimaryKey(PatientInfo record);
}