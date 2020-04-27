package com.tallon.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-27 01:02
 */
@Data
@TableName("table_store")
public class Store {
    private Integer id;
    private String name;
}
