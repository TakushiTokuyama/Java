package study02;

import java.util.List;

// 更新
public interface Update {

	List<String> UpdateOne(String TtelephoneNumber);

	List<String> UpdateAll(List<String> telephoneNumberList);
}
