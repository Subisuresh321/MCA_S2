import pymongo

conn = pymongo.MongoClient("mongodb://localhost:27017/")

db=conn["mydatabase"]
col=db["student"]

value=[
    {"Name":"Subi","Age":21,"Married":True},
    {"Name":"SOORYA","Age":30,"Married":True,"_id":1},
    {"Name":"Subi","course":"MCA"}
        ]
# col.insert_many(value)

var=col.find({},{"Name":1,"_id":0})
for i in var: 
    print(i)
