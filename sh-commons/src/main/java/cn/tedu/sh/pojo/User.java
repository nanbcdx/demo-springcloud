package cn.tedu.sh.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sh_user")
public class User {

	@TableId(type = IdType.AUTO)
	private Integer id;
	private String username;
	private String password;
	private Integer score;
}
