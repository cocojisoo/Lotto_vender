package domain

enum class LottoPrize(val matchCount : Int, val prize : Long, val explain : String){
    FIRST(6, 2_100_000_000, "1등 - 21억")
    SECOND(5, 6_000_000, "2등 - 6천만원(*보너스 일치)")
    THIRD(5, 1_500_000, "3등 - 150만원")
    FOURTH(4,50_000, "4등 - 5만원")
    FIFTH(3, 4_000, "5등 - 4천원")
    FAIL(null, null, "꽝")

    companion object{
        fun prizeMatch(matchCount: Int, isBonusMatch : Boolean): LottoPrize{
            return when{
                matchCount == 6 -> FIRST
                matchCount == 5 && isBonusMatch -> Second
                matchCount == 5 -> Third
                matchCount == 4 -> FOURTH
                matchCount == 3 -> FIFTH
                else -> FAIL
            }
        }
    }

}