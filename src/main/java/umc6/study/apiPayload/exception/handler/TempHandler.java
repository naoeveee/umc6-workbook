package umc6.study.apiPayload.exception.handler;


import umc6.study.apiPayload.code.status.BaseErrorCode;
import umc6.study.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}