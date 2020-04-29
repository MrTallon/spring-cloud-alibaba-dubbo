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
 * 优选专区和产品关系表
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cms_prefrence_area_product_relation")
public class PrefrenceAreaProductRelation extends Model<PrefrenceAreaProductRelation> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long prefrenceAreaId;

    private Long productId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
