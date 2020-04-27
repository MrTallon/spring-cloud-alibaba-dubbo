package com.tallon.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-27 09:23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("book")
public class Book {
    private Integer id;
    private String name;
    private String description;
}
