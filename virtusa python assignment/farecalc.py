rates = {
    "Economy": 10,
    "Premium": 18,
    "SUV": 25
}

def calculate_fare(km, vtype, hour):
    if vtype not in rates:
        return "Service Not Available"

    fare = km * rates[vtype]

    if 17 <= hour <= 20:
        fare = fare * 1.5

    return fare


km = float(input("Enter distance: "))
vtype = input("Enter vehicle type: ")
vtype = vtype.upper()
hour = int(input("Enter hour: "))

result = calculate_fare(km, vtype, hour)

print("\nPrice Receipt")
if result == "Service Not Available":
    print(result)
else:
    print("Distance:", km)
    print("Vehicle:", vtype)
    print("Fare:", result)