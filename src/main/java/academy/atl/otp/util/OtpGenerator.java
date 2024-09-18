package academy.atl.otp.util;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class OtpGenerator {

  private static final int OTP_LENGTH = 6;
  private static final SecureRandom random = new SecureRandom();

  public static String generateOtp() {
    StringBuilder otp = new StringBuilder(OTP_LENGTH);
    for (int i = 0; i < OTP_LENGTH; i++) {
      otp.append(random.nextInt(10));
    }
    return otp.toString();
  }
}
