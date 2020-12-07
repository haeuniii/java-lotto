package lottery.domain;

import java.util.Objects;

public class LotteryWinning {
    private final LotteryTicket winningTicket;

    public LotteryWinning(String winningNumbers) {
        this.winningTicket = new LotteryTicket(winningNumbers);
    }

    public int getCountsMatched(LotteryTicket otherLotteryTicket) {
        int matchCount = 0;
        for(LotteryNumber number : otherLotteryTicket.getLotteryNumbers()) {
            matchCount += winningTicket.getLotteryNumbers().contains(number) ? 1 : 0;
        }
        return matchCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LotteryWinning that = (LotteryWinning) o;
        return Objects.equals(winningTicket, that.winningTicket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winningTicket);
    }
}
