class BigDelight {
    public static void main(String[] args) {
        System.out.println((byte)Byte.MIN_VALUE);
        System.out.println((byte)Byte.MAX_VALUE);
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == (byte)0x90)
            {
                System.out.print("Joy!");
                System.out.print((byte)0x90);
            }
        }
    }
}
