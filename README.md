# hermes

_Поддерживаемые торговые стратегии_
1. Усреднение позиции (в разработке)
2. Скальпинг (в разработке)

_Подключение Binance API_
1. Скачать ZIP архивом API для Java - https://github.com/binance-exchange/binance-java-api
2. Распаковать архив и импортировать его, как новый модуль в проект
3. В pom.xml добавить зависимость
 ```
    <dependency>
			<groupId>com.binance.api</groupId>
			<artifactId>binance-api-client</artifactId>
			<version>{current-version}</version>
			<scope>compile</scope>
		</dependency>

 ```
4. В файле application.yml подставить значения binance.api.key и binance.api.secret, которые доступны в лк Binance

_Стэк проекта_
* Java 17
