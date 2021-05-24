import { render } from "@testing-library/react"
import React from "react";

class Statefull extends React.Component{
    constructor(){
        super();
        this.state = {
            data:
            [
                {
                    'id': 1,
                    'name': "John",
                    'age': 13
                },
                {
                    'id': 2,
                    'name': "Mary",
                    'age': 24
                },
                {
                    'id': 3,
                    'name': "Henry",
                    'age': 30
                }
            ]
        }
    }

    render(){
        return(
            <div>
                <Header/>
                <table>
                    <tbody>
                        {this.state.data.map((i,person)=><TableRow key = {i} data = {person}/>)} 
                    </tbody>
                </table>
            </div>

        );
    }

}

class Header extends React.Component{
    render(){
        return(
            <div>
                Header
            </div>
        );
    }
}

class TableRow extends React.Component{
    render(){
        return (
            <tr>
               <td>{this.props.data.id}</td>
               <td>{this.props.data.name}</td>
               <td>{this.props.data.age}</td>
            </tr>
         );
    }
}

export default Statefull;