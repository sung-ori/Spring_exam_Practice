package net.softsociety.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 리플 정보
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reply {

	int replynum;
	int boardnum;
	String memberid;
	String replytext;
	String inputdate;
}
