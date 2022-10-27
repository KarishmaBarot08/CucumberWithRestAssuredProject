Feature: Fetch data from API

  Scenario Outline: Get data from API
    Given I provide API "<URI>"

    Then I verify data

    Examples:
      | URI                                                     |
      | ?q=London&appid=b1b15e88fa797225412429c1c50c122a1       |
      | ?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1    |
      | ?id=2172797&appid=b1b15e88fa797225412429c1c50c122a1     |
      | ?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1 |
      | ?zip=94040,us&appid=b1b15e88fa797225412429c1c50c122a1   |