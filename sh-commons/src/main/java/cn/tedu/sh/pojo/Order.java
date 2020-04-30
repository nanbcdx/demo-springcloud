package cn.tedu.sh.pojo;

import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sh_order")
public class Order {

	@TableId(type= IdType.AUTO)
	private String id;
	private Integer userId;
	private Integer itemId;
}
