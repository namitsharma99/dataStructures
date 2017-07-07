package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		try {
			checkComposition("INTEL@01");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void checkComposition(String password) throws Exception {
		int minLength = 3;
		if (password == null || password.length() < minLength) {
			throw new Exception();
		}

		checkMinCapitals(password);

	}

	private static void checkMinCapitals(String password) throws Exception {

		int minCaps = 3;
		if (minCaps  < 1) {
			return;
		}

		int count = 0;
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count++;
			}
		}

		if (count < minCaps) {
			throw new Exception();
		}

	}


	public static void main22(String[] args) {
		// TODO Auto-generated method stub

		List<CtOtpTyp> ctOtpTypList = new ArrayList<CtOtpTyp>();
		CtOtpTyp typ = new Test.CtOtpTyp();
		typ.setOtpTypNm("IVR_HASH");
		typ.setPhoneTransmission("VOICE");
		ctOtpTypList.add(typ);

		/*
		 * CtOtpTyp typ1 = new Test.CtOtpTyp(); typ1.setOtpTypNm("UIS_SMS");
		 * typ1.setPhoneTransmission("SMS"); ctOtpTypList.add(typ1);
		 */
		/*
		 * CtOtpTyp typ2 = new Test.CtOtpTyp(); typ2.setOtpTypNm("UIS_IVR");
		 * typ2.setPhoneTransmission("VOICE"); ctOtpTypList.add(typ2);
		 */

		CtOtpTyp typ3 = new Test.CtOtpTyp();
		typ3.setOtpTypNm("IVR_HASH");
		typ3.setPhoneTransmission("VOICE");
		ctOtpTypList.add(typ3);

		CtOtpTyp typ1 = new Test.CtOtpTyp();
		typ1.setOtpTypNm("UIS_SMS");
		typ1.setPhoneTransmission("SMS");
		ctOtpTypList.add(typ1);

		boolean IVR = false;
		boolean IVR_HASH = false;
		boolean SMS = false;
		String otpTypeName = null;
		for (CtOtpTyp ctOtpTyp : ctOtpTypList) {
			if ("UIS_SMS".equals(ctOtpTyp.getOtpTypNm())
					&& "SMS".equals(ctOtpTyp.getPhoneTransmission())) {
				SMS = true;
			} else if ("UIS_IVR".equals(ctOtpTyp.getOtpTypNm())
					&& "VOICE".equals(ctOtpTyp.getPhoneTransmission())) {
				IVR = true;
			} else if ("IVR_HASH".equals(ctOtpTyp.getOtpTypNm())
					&& "VOICE".equals(ctOtpTyp.getPhoneTransmission())) {
				IVR_HASH = true;
			}
		}
		if (SMS) {
			otpTypeName = "SMS";
		} else {
			if (IVR)
				otpTypeName = "UIS_IVR";
			else if (!IVR && IVR_HASH)
				otpTypeName = "IVR_HASH";
		}
		System.out.println("---- " + otpTypeName);
	}

	static class CtOtpTyp {
		private String otpTypNm;
		private String phoneTransmission;

		public String getOtpTypNm() {
			return otpTypNm;
		}

		public void setOtpTypNm(String otpTypNm) {
			this.otpTypNm = otpTypNm;
		}

		public String getPhoneTransmission() {
			return phoneTransmission;
		}

		public void setPhoneTransmission(String phoneTransmission) {
			this.phoneTransmission = phoneTransmission;
		}

	}

}
