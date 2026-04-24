package dto

data class LottoDto(
    val lottoNumbers : List<Int>
)

data class LottoResponse(
    val lottos : List<LottoDto>
)