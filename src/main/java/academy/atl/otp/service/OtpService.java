package academy.atl.otp.service;

import academy.atl.otp.dao.enums.OtpStatus;
import academy.atl.otp.util.dto.SendOtpRequestDto;
import academy.atl.otp.util.dto.SendOtpResponseDto;

public interface OtpService {

  SendOtpResponseDto sendOtp(SendOtpRequestDto sendOtpRequestDto);
  void verifyOtp(String msisdn, Integer otp);
}
