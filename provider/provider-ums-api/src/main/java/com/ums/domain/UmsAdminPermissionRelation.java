package com.ums.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsAdminPermissionRelation extends Model<UmsAdminPermissionRelation> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long adminId;

    private Long permissionId;

    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
