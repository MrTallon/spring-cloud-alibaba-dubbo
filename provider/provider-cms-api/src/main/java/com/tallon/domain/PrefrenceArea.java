package com.tallon.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 优选专区
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cms_prefrence_area")
public class PrefrenceArea extends Model<PrefrenceArea> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String subTitle;

    /**
     * 展示图片
     */
    private byte[] pic;

    private Integer sort;

    private Integer showStatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
