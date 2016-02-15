package co.coinsmith.kafka.cryptocoin

import com.xeiam.xchange.bitfinex.v1.BitfinexExchange
import com.xeiam.xchange.bitstamp.BitstampExchange
import com.xeiam.xchange.okcoin.OkCoinExchange


class ExchangeServiceSpec extends KafkaCryptocoinFunSpec {
  describe("ExchangeService") {
    it("should load all exchanges") {
      val expected = Set(
        classOf[BitfinexExchange],
        classOf[BitstampExchange],
        classOf[OkCoinExchange]
      )
      val result = ExchangeService.getExchanges.map(_.getClass).toSet
      assert(expected == result)
    }
  }
}