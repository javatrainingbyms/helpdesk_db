import java.util.List;
import java.util.Scanner;

import com.ms.entity.User;
import com.ms.repo.UserRepository;

public class SearchUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserRepository userRepository = new UserRepository();
		List<User> users = userRepository.findAll();
		for (User user : users) {
			System.out.println(user.getUserId());
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getMobile());
			System.out.println(user.getUserType());
			System.out.println("_______________________________________________");
		}
		/*
		 * System.out.println("Enter Userid To Be Searched : "); String
		 * userId=sc.next();
		 * 
		 * UserRepository userRepository=new UserRepository(); User
		 * user=userRepository.findById(userId); System.out.println(user.getUserId());
		 * System.out.println(user.getName()); System.out.println(user.getEmail());
		 * System.out.println(user.getMobile()); System.out.println(user.getUserType());
		 */

	}
}
