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
 * 用户和标签关系表
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_member_member_tag_relation")
public class MemberMemberTagRelation extends Model<MemberMemberTagRelation> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long memberId;

    private Long tagId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
