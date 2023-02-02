### House Types Application
Create 3 house types: House, Villa, Summer House.

**Also write the following methods inside a service class:**
* A method that returns the total prices of houses.
* A method that returns the total prices of villas.
* The method that returns the total prices of the summerhouses.
* Method to return the total price of all types of houses.
* A method that returns the average square meter of houses.
* A method that returns the average square meter of villas.
* The method that returns the average square meter of the summerhouses.
* Method to return the average square meter of houses of all types.
* A method that filters all types of houses according to the number of rooms and living room and returns.

**Notes:**

* Make sure the nomenclature is in English.
* Design in accordance with object-oriented programming.
* Follow the clean code principles.
* Print all the methods in the main method to the console in a meaningful way.

### Output
```markdown
HOMES
ID: 1 HOME_TYPE: homeOne PRICE: 850000.0 SQUARE_METER: 80 NUMBER_OF_ROOM: 2 NUMBER_OF_LOUNGE: 2
ID: 2 HOME_TYPE: homeTwo PRICE: 1000000.0 SQUARE_METER: 120 NUMBER_OF_ROOM: 3 NUMBER_OF_LOUNGE: 1
ID: 3 HOME_TYPE: homeThree PRICE: 1750000.0 SQUARE_METER: 135 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 1
TOTAL_PRICE_HOMES: 3600000 ₺
AVERAGE_SQUARE_METER: 111.66666666666667 m²
 
VILLAS
ID: 4 HOME_TYPE: villaOne PRICE: 5250000.0 SQUARE_METER: 135 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 1
ID: 5 HOME_TYPE: villaTwo PRICE: 9500000.0 SQUARE_METER: 210 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 2
ID: 6 HOME_TYPE: villaThree PRICE: 9950000.0 SQUARE_METER: 300 NUMBER_OF_ROOM: 5 NUMBER_OF_LOUNGE: 2
TOTAL_PRICE_VILLAS: 24700000 ₺
AVERAGE_SQUARE_METER: 215.0 m²
 
SUMMER_HOUSES
ID: 7 HOME_TYPE: summerHouseOne PRICE: 2650000.0 SQUARE_METER: 135 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 1
ID: 8 HOME_TYPE: summerHouseTwo PRICE: 4500000.0 SQUARE_METER: 180 NUMBER_OF_ROOM: 5 NUMBER_OF_LOUNGE: 1
ID: 9 HOME_TYPE: summerHouseThree PRICE: 2250000.0 SQUARE_METER: 120 NUMBER_OF_ROOM: 3 NUMBER_OF_LOUNGE: 1
TOTAL_PRICE_SUMMER_HOUSES: 9400000 ₺
AVERAGE_SQUARE_METER: 145.0 m²
 
ALL_TYPES_TOTAL_PRICE: 37700000 ₺
ALL_TYPES_AVERAGE_SQUARE_METER: 157.22222222222223 m²
 
FILTER_ALL_TYPES_BY_NUMBER_OF_ROOMS
ID: 3 HOME_TYPE: homeThree PRICE: 1750000.0 SQUARE_METER: 135 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 1
ID: 4 HOME_TYPE: villaOne PRICE: 5250000.0 SQUARE_METER: 135 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 1
ID: 5 HOME_TYPE: villaTwo PRICE: 9500000.0 SQUARE_METER: 210 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 2
ID: 7 HOME_TYPE: summerHouseOne PRICE: 2650000.0 SQUARE_METER: 135 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 1
 
FILTER_ALL_TYPES_BY_NUMBER_OF_LOUNGE
ID: 1 HOME_TYPE: homeOne PRICE: 850000.0 SQUARE_METER: 80 NUMBER_OF_ROOM: 2 NUMBER_OF_LOUNGE: 2
ID: 5 HOME_TYPE: villaTwo PRICE: 9500000.0 SQUARE_METER: 210 NUMBER_OF_ROOM: 4 NUMBER_OF_LOUNGE: 2
ID: 6 HOME_TYPE: villaThree PRICE: 9950000.0 SQUARE_METER: 300 NUMBER_OF_ROOM: 5 NUMBER_OF_LOUNGE: 2
```
