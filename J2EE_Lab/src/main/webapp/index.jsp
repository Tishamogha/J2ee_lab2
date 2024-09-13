<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>
            SOCKET MACHINE
        </title>
    </head>
    <style>
        body{
            font-family:Arial, sans-serif;
            margin:20px;
        }
        h1{
            text-align: center;
            color: #333
        }
    </style>
    <body>
        <h1>Enter your Details Below</h1>
        <form action="SocketMachine" method="post" style="max-width: 500px; margin: 0 auto; padding: 25px; border: 1px solid #272727; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
            <label for="name" style="margin:5px">Name:</label><br>
            <input type="text" id="name" name="name" style="margin:5px"><br>
            <label for="email" style="margin:5px">Email:</label><br>
            <input type="text" id="email" name="email" style="margin:5px"><br>
            <label for="options" style="display: block; margin-bottom: 10px; font-weight: bold;">Socket:</label>
            <select id="options" name="options" style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 5px; font-size: 16px;margin-bottom:5px;">
                <option value="Type-A">Type A</option>
                <option value="Type-B">Type B</option>
                <option value="Type-C" >Type C</option>
            </select><br>
            <label for="quantity" style="margin:8px">Quantity:</label>
            <input type="number" id="quantity" name="quantity">
            <button type="submit" style="display: block; width: 100%; padding: 10px; margin-top: 20px; border: none; border-radius: 5px; background-color: #28a745; color: #fff; font-size: 16px; cursor: pointer;">
                Submit
            </button>
        </form>
    </body>
</html>
