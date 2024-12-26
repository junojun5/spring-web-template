package module.common.exception;

import lombok.Getter;

@Getter
public class ForiddenException extends CustomException{

	public ForiddenException(String message, ErrorCode errorCode) {
		super(message, errorCode);
	}

	public ForiddenException(String message) {
		super(message, ErrorCode.FORBIDDEN_EXCEPTION);
	}
}
