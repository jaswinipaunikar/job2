package com.manipal.util;

import java.security.SecureRandom;
import java.util.UUID;

public class GenerateCartId {
	public static String cartId(){
		UUID idOne = UUID.randomUUID();
		UUID idTwo = UUID.randomUUID();
		UUID idThree = UUID.randomUUID();
		UUID idFour = UUID.randomUUID();

		String time = idOne.toString().replace("-", "");
		String time2 = idTwo.toString().replace("-", "");
		String time3 = idThree.toString().replace("-", "");
		String time4 = idFour.toString().replace("-", "");

		StringBuffer data = new StringBuffer();
		data.append(time);
		data.append(time2);
		data.append(time3);
		data.append(time4);

		    SecureRandom random = new SecureRandom();
		int beginIndex = random.nextInt(100);       //Begin index + length of your string < data length
		int endIndex = beginIndex + 10;            //Length of string which you want

		String yourID = data.substring(beginIndex, endIndex);
		return yourID;
	}
}
