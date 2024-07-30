
# Ptsv2paymentsProcessingInformationRecurringOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loanPayment** | **Boolean** | Flag that indicates whether this is a payment towards an existing contractual loan.  Possible values: - &#x60;true&#x60;: Loan payment - &#x60;false&#x60;: (default) Not a loan payment  |  [optional]
**firstRecurringPayment** | **Boolean** | Flag that indicates whether this transaction is the first in a series of recurring payments.  This field is supported only for **Atos**, **FDC Nashville Global**, and **OmniPay Direct**.  Possible values:  - &#x60;true&#x60; Indicates this is the first payment in a series of recurring payments  - &#x60;false&#x60; (default) Indicates this is not the first payment in a series of recurring payments.  |  [optional]



