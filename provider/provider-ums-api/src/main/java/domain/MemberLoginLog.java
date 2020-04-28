package com.tallon.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员登录记录
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_member_login_log")
public class MemberLoginLog extends Model<MemberLoginLog> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long memberId;

    private LocalDateTime createTime;

    private String ip;

    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    private Integer loginType;

    private String province;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
