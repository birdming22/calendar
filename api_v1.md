# API V1.0

## Date

Get date from seconds

    GET /v1.0/date/{date-in-seconds}

### Response

    {
      "year": 2016,
      "month": 1,
      "day": 27,
      "hour": 15,
      "minute": 24,
      "second": 0
    }

## Solar Term

Get solar term from milliseconds

    GET /v1.0/solarterm/{date-in-milliseconds}

### Response

    {
      "year": 2016,
      "id": 1
    }

