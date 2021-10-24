# hermes

**Поддерживаемые торговые стратегии**

    1. Усреднение позиции (в разработке)
    2. Скальпинг (в разработке)

**Подключение Binance API**
1. Скачать ZIP архивом API для Java - https://github.com/binance-exchange/binance-java-api
2. Распаковать архив и импортировать его, как новый модуль в проект по пути hermes/libs
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

**Стэк проекта**

    Java 17

**Git Conventional Commits**

   Разработчик должен придерживаться следующей структуры коммитов:
    
    <type>(<scope>): <subject>
    
   Заголовок коммита должен начинаться с типа (type), указывающего на специфику внесенных в кодовую базу изменений.
   У коммита может быть область (scope). Она характеризует фрагмент кода, которую затронули изменения. 
   Стандарт не регламентирует четкий список областей. Примеры областей: eslint, git, analytics и т.д.
   Описание коммита должно быть сразу после типа/области после знака ":".
    
    Пример:
    feat(architecture): added shell user client
    fix(jobs): changed schedule time
    
    Используем следующие типы коммитов:
    build 	Сборка проекта или изменения внешних зависимостей
    ci 	Настройка CI и работа со скриптами
    docs 	Обновление документации
    feat 	Добавление нового функционала
    fix 	Исправление ошибок
    perf 	Изменения направленные на улучшение производительности
    refactor 	Правки кода без исправления ошибок или добавления новых функций
    revert 	Откат на предыдущие коммиты
    style 	Правки по кодстайлу (табы, отступы, точки, запятые и т.д.)
    test 	Добавление тестов
    
**Docker**

Сборка и запуск контейнера приложения
    
    docker build -t hermes .
    docker run -p 8080:8080 -t hermes

Запуск проекта с окружением

    docker-compose up --build hermes