import React from 'react';
import { connect } from 'react-redux';

class PracticeReduxApp extends React.Component{ 
  render() {
    const {data} = this.props.data;

    return (
        <div>
            <h1>App render...</h1>
            <table>
              <tbody>
                <tr>
                  <th>Id</th>
                  <th>Url</th>
                </tr>
                {
                  data.map((my_data) => (
                    <tr>
                      <th>{my_data.id}</th>
                      <th>{my_data.url}</th>
                    </tr>
                  ))
                }
              </tbody>
            </table>
        </div>
      );
  }
}

const mapStateToProps = (state) => {
  return {
    data: state.data,
  }
}

export default connect(mapStateToProps)(PracticeReduxApp);