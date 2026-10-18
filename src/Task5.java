import java.util.Arrays;

public class Task5
{

    // Основний інтерфейс шифрування
    interface Encryption
    {
        byte[] encrypt(byte[] data);
        byte[] decrypt(byte[] data);
    }

    // Інтерфейс симетричного шифрування
    interface SymmetricEncryption extends Encryption {
    }

    // Інтерфейс асиметричного шифрування
    interface AsymmetricEncryption extends Encryption {
    }

    // Інтерфейс блочного шифрування
    interface BlockEncryption extends SymmetricEncryption {
    }

    // Інтерфейс потокового шифрування
    interface StreamEncryption extends SymmetricEncryption {
    }

    // Клас потокового XOR-шифрування
    static class XorCipher implements StreamEncryption
    {

        private static final byte KEY = 0x5A;

        // Статичний метод перетворення байтового масиву
        static byte[] transform(byte[] data)
        {
            byte[] result = new byte[data.length];

            for (int i = 0; i < data.length; i++)
            {
                result[i] = (byte) (data[i] ^ KEY);
            }

            return result;
        }

        @Override
        public byte[] encrypt(byte[] data)
        {
            return transform(data);
        }

        @Override
        public byte[] decrypt(byte[] data)
        {
            return transform(data);
        }
    }

    public static void main(String[] args)
    {

        // Початковий масив байтів
        byte[] original = {65, 66, 67, 68};

        XorCipher cipher = new XorCipher();

        // Шифрування
        byte[] encrypted = cipher.encrypt(original);

        // Розшифрування
        byte[] decrypted = cipher.decrypt(encrypted);

        System.out.println("Початковий масив: "
                + Arrays.toString(original));

        System.out.println("Зашифрований масив: "
                + Arrays.toString(encrypted));

        System.out.println("Розшифрований масив: "
                + Arrays.toString(decrypted));

        System.out.println("Перевірка: "
                + Arrays.equals(original, decrypted));
    }
}