package cn.jackiegu.spring.cloud.alibaba.provider.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author JackieGu
 * @date 2021/8/3
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 7952049532353908902L;

    private Long id;

    private String name;

    private Integer age;
}
