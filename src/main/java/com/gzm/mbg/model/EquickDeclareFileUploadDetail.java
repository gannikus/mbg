package com.gzm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class EquickDeclareFileUploadDetail implements Serializable {
    /**
     * 上传明细id
     */
    @ApiModelProperty(value = "上传明细id")
    private Integer id;

    /**
     * 上传id
     */
    @ApiModelProperty(value = "上传id")
    private Integer uploadId;

    /**
     * 上传文件名称
     */
    @ApiModelProperty(value = "上传文件名称")
    private String uploadFileName;

    /**
     * 上传路径
     */
    @ApiModelProperty(value = "上传路径")
    private String uploadFileUrl;

    /**
     * 上传人
     */
    @ApiModelProperty(value = "上传人")
    private String uploadMan;

    /**
     * 上传时间
     */
    @ApiModelProperty(value = "上传时间")
    private Date uploadTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadFileUrl() {
        return uploadFileUrl;
    }

    public void setUploadFileUrl(String uploadFileUrl) {
        this.uploadFileUrl = uploadFileUrl;
    }

    public String getUploadMan() {
        return uploadMan;
    }

    public void setUploadMan(String uploadMan) {
        this.uploadMan = uploadMan;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uploadId=").append(uploadId);
        sb.append(", uploadFileName=").append(uploadFileName);
        sb.append(", uploadFileUrl=").append(uploadFileUrl);
        sb.append(", uploadMan=").append(uploadMan);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}