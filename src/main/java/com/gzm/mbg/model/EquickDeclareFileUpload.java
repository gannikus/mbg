package com.gzm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class EquickDeclareFileUpload implements Serializable {
    /**
     * 上传id
     */
    @ApiModelProperty(value = "上传id")
    private Integer id;

    /**
     * 上传编码（主运单号）
     */
    @ApiModelProperty(value = "上传编码（主运单号）")
    private String uploadNum;

    /**
     * 上传时间
     */
    @ApiModelProperty(value = "上传时间")
    private Date uploadTime;

    /**
     * 上传人
     */
    @ApiModelProperty(value = "上传人")
    private String uploadMan;

    /**
     * 最后上传时间
     */
    @ApiModelProperty(value = "最后上传时间")
    private Date lastUploadTime;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private String modifyUser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUploadNum() {
        return uploadNum;
    }

    public void setUploadNum(String uploadNum) {
        this.uploadNum = uploadNum;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadMan() {
        return uploadMan;
    }

    public void setUploadMan(String uploadMan) {
        this.uploadMan = uploadMan;
    }

    public Date getLastUploadTime() {
        return lastUploadTime;
    }

    public void setLastUploadTime(Date lastUploadTime) {
        this.lastUploadTime = lastUploadTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uploadNum=").append(uploadNum);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", uploadMan=").append(uploadMan);
        sb.append(", lastUploadTime=").append(lastUploadTime);
        sb.append(", modifyUser=").append(modifyUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}