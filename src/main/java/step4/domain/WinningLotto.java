package step4.domain;

public class WinningLotto {
    private Lotto lotto;
    private LottoNumber bonusNumber;
    private final String ARGUMENT_EXCEPTION_MESSAGE = "보너스 번호는 당첨번호에 포함될 수 없습니다.";

    public WinningLotto(Lotto lotto, LottoNumber bonusNumber) {
        this.lotto = lotto;
        if (this.lotto.contains(bonusNumber)) {
            throw new IllegalArgumentException(ARGUMENT_EXCEPTION_MESSAGE);
        }
        this.bonusNumber = bonusNumber;
    }

    public int match(Lotto lotto) {
        int matchCount = 0;
        for (LottoNumber lottoNumber : lotto.getLotto()) {
            matchCount += this.lotto.contains(lottoNumber) ? 1 : 0;
        }

        return matchCount;
    }

    public boolean matchBonus(Lotto lotto) {
        return lotto.contains(bonusNumber);
    }
}
