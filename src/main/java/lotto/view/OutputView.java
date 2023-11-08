package lotto.view;

import java.util.ArrayList;
import java.util.List;
import lotto.Lotto;
import lotto.model.LottoCount;
import lotto.model.Lottos;

public class OutputView {
    private static final String NEW_LINE = System.lineSeparator();
    private static final String INPUT_MONEY = "구입금액을 입력해 주세요.";
    private static final String PURCHASED_LOTTO_COUNT = "%d개를 구매했습니다.";

    public static void printInputMoneyMessage() {
        System.out.println(INPUT_MONEY);
    }

    public static void printLottoCount(LottoCount lottoCount) {
        System.out.println(NEW_LINE);
        System.out.printf(PURCHASED_LOTTO_COUNT, lottoCount.getLottoCount());
        System.out.println(NEW_LINE);
    }

    public static void printPurchasedLotto(Lottos lottos) {
        for (Lotto lotto : lottos.get()) {
            List<Integer> numbers = new ArrayList<>(lotto.get());
            System.out.println(numbers);
        }
        System.out.println(NEW_LINE);
    }
}
