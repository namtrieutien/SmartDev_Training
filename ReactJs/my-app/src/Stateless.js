import React from "react";

function Stateless() {
    return (
      <div className="Stateless">
        <Headers/>
        <Content/>
      </div>
    );
}

class Header extends React.Component{
    render(){
        return (
            <div>
                Header
            </div>
        );
    }

}

class Content extends React.Component{
    render(){
        return(
            <div>
                <h1>Content</h1>
                <p>This is content!</p>
            </div>
        );
    }
}
  
  
export default Stateless;