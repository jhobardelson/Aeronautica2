Feature: Financial situation

  Scenario: financial situation succefull
    Given the user enter to web site "https://www.aerocivil.gov.co/"

    When He Find the status of your financial situation

    Then Validation the url pdf "https://www.aerocivil.gov.co/atencion/presupuesto/Estados%20Financieros/Estado%20de%20Situaci%C3%B3n%20Financiera%20a%2030%20de%20abril%20de%202021.pdf"