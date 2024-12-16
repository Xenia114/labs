import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.*;


public class RUSSIONletters {
    // Метод для получения уникальных русских букв из файла
    public Set<Character> getLetters(String file) throws IOException {
        Set<Character> unik_bukvi = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char character = (char) ch;
                if (isRussianLetter(character)) {
                    unik_bukvi.add(Character.toLowerCase(character));
                }
            }
        }
        return unik_bukvi;
    }

    // Проверка, является ли символ русской буквой
    private boolean isRussianLetter(char ch) {
        return (ch >= 'А' && ch <= 'я') || ch == 'Ё' || ch == 'ё';
    }
}
