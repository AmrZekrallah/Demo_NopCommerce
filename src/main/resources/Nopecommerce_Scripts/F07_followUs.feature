Feature: User try to open many links

  Scenario:user opens facebook link

    Given user opens the website URL for facebook
    Then user switch between tabs

  Scenario:user opens twitter link

    Given user opens the website URL for twitter
    Then user can switch between tabs

  Scenario:user opens rss link

    Given user opens the website URL for Rss
    Then user switch between Rss tabs

  Scenario:user opens youtube link

    Given user opens the website URL for youtube
    Then user switch between youtube and original tab