package com.ums.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户标签表
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsMemberTag extends Model<UmsMemberTag> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    /**
     * 自动打标签完成订单数量
     */
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    private BigDecimal finishOrderAmount;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
