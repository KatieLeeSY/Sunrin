package java20170905;

public class ByteExam02 {

	public static void main(String[] args) throws Exception {
		byte[] b = new byte[1024];

		int len = 0;

		while (true) {
			len = System.in.read(b);

			if (len == -1)
				break;

			// 한글자만
			// System.out.write(b);
			System.out.write(b, 0, len);
		}
	}

}
