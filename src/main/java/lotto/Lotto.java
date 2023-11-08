package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private static final String INVALID_LOTTO_SIZE = "[ERROR] 로또는 6개의 숫자로 이루어져야 합니다.";
    private static final String INVALID_NUMBER_RANGE = "[ERROR] 로또 번호의 범위는 1 ~ 45까지 입니다.";
    private static final int LOTTO_SIZE = 6;
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 45;
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(numbers);
    }

    private void validate(List<Integer> numbers) {
        validateLottoSize(numbers);
        validateNumberRange(numbers);
    }

    private void validateLottoSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException(INVALID_LOTTO_SIZE);
        }
    }

    private void validateNumberRange(List<Integer> numbers) {
        if (!isValidRange(numbers)) {
            throw new IllegalArgumentException(INVALID_NUMBER_RANGE);
        }
    }

    private boolean isValidRange(List<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < MIN_RANGE || number > MAX_RANGE);
    }
}
